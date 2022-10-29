let [hours, minutes, seconds, milliseconds] = [0,0,0,0];
let stopWatch = document.getElementById('stopwatch');
let display = null;

    document.getElementById('start').addEventListener('click', () => {
        if (display !== null) {
            clearInterval(display);
        }
        display = setInterval(displayTimer,10);
    });

    document.getElementById('stop').addEventListener('click', () => {
        clearInterval(display);
    });

    document.getElementById('reset').addEventListener('click', () => {
        clearInterval(display);
        [hours,minutes,seconds, milliseconds] = [0,0,0,0];
        stopWatch.innerHTML = '00 : 00 : 00 : 000';
    });

    function displayTimer() {
        milliseconds+=10;

        if (milliseconds == 1000) {
            milliseconds = 0;
            seconds++;

            if (seconds == 60) {
                seconds = 0;
                minutes++;

                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
            }
        }

        let h = hours < 10 ? '0' + hours : hours;
        let m = minutes < 10 ? '0' + minutes : minutes;
        let s = seconds < 10 ? '0' + seconds : seconds;
        let ms = milliseconds < 10 ? '00' + milliseconds : milliseconds < 100 ? '0' + milliseconds : milliseconds;

        stopWatch.innerHTML =` ${h} : ${m} : ${s} : ${ms}`;
    }