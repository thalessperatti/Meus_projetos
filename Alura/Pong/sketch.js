//variáveis da bolinha
let xBolinha = 300;
let yBolinha = 200;
let diametro = 13;
let raio = diametro / 2;

//velocidade da bolinha
let velocidadeXBolinha = 6;
let velocidadeYBolinha = 6;

//variáveis da raquete
let xRaquete = 5;
let yRaquete = 150;
let raqueteComprimento = 10;
let raqueteAltura = 90;

//variáveis do oponente
let xRaqueteOponente = 585;
let yRaqueteOponente = 150;
let velocidadeYOponente;

//placar do jogo
let meusPontos = 0;
let pontosDoOponente = 0;

//sons do jogo
let somRaquetada;
let somPonto;
let somTrilha;

function preload() {
somTrilha = loadSound("trilha.mp3");
somPonto = loadSound("ponto.mp3");
somRaquetada = loadSound("raquetada.mp3");
}

function setup() {
createCanvas(600, 400);
somTrilha.loop();
}

function draw() {
background(0);
mostraBolinha();
movimentaBolinha();
verifcaColisaoBorda();
mostraRaquete(xRaquete,yRaquete);
movimentaMinhaRaquete();      
mostraRaquete(xRaqueteOponente,yRaqueteOponente);
movimentaRaqueteOponente();
verificaColisaoRaquete(xRaquete,yRaquete);
verificaColisaoRaquete(xRaqueteOponente,yRaqueteOponente);
incluiPlacar();
marcaPonto();
}


function mostraBolinha() {
circle(xBolinha,yBolinha,diametro);
color(255);
}

function movimentaBolinha() {
xBolinha += velocidadeXBolinha;
yBolinha += velocidadeYBolinha;
}

function verifcaColisaoBorda() {
if (xBolinha + raio > width || xBolinha - raio < 0) {
    velocidadeXBolinha *= -1;
}

if (yBolinha + raio > height || yBolinha - raio < 0) {
    velocidadeYBolinha *= -1;
}
}

function mostraRaquete(x,y) {
rect(x,y,raqueteComprimento,raqueteAltura);
}

function movimentaMinhaRaquete() {
if (keyIsDown(UP_ARROW)) {
    yRaquete -= 10;
}

if (keyIsDown(DOWN_ARROW)) {
    yRaquete += 10;
}
}

function verificaColisaoRaquete(x,y) {
if (xBolinha - raio < x + raqueteComprimento && yBolinha - raio < y + raqueteAltura && yBolinha + raio > y) {
    velocidadeXBolinha *= -1;
    somRaquetada.play();
}
}

function movimentaRaqueteOponente() {
//jogando com oponente humano
if (keyIsDown(87)) {
   yRaqueteOponente -= 10;
}

if (keyIsDown(83)) {
   yRaqueteOponente += 10;
} 

//jogando contra a máquina
//velocidadeYOponente = yBolinha - yRaqueteOponente - (raqueteComprimento / 2) - 30;
//yRaqueteOponente += velocidadeYOponente;
}

function incluiPlacar() {
stroke(255);
textAlign(CENTER);
textSize(16);
fill(color(255,140,0));
rect(150,10,40,20);
fill(255);
text(meusPontos, 170, 26);
fill(color(255,140,0));
rect(450,10,40,20);
fill(255);
text(pontosDoOponente, 470,26);
}

function marcaPonto() {
if (xBolinha > 590) {
    meusPontos += 1;
    somPonto.play();
}

if (xBolinha < 10) {
    pontosDoOponente += 1;
    somPonto.play();
}
}