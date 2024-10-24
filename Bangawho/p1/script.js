// 이메일 유효성 검사 함수를 만들거다.
function validateEmail(email) {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    // test 이거하면 얘가 잉일히 테스트해줌
    return emailPattern.test(email)
};

// 비밀번호 유효성 검사 함수를 만들거다.
function validatePassword(password) {
    const passwordPattern = /^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
    return passwordPattern.test(password)
};

const emailInput = document.getElementById('email');
const passwordInput = document.getElementById('password');
const confirmPasswordInput = document.getElementById('confirmPassword');
const emailError = document.getElementById('emailError');
const passwordError = document.getElementById('passwordError');
const confirmPasswordError = document.getElementById('confirmPasswordError');

// 이메일 입력 실시간 검사
emailInput.addEventListener('input', function(){
    const email = emailInput.value;
    if (!validateEmail(email)) {
        emailError.textContent = '유효한 이메일 형식을 입력하세요.';
        emailError.style.display = 'block';
    } else {
        emailError.style.display = 'none';
    }
});

// 비밀번호 입력 실시간 검사
passwordInput.addEventListener('input', function(){
    const password = passwordInput.value;
    if (!validatePassword(password)) {
        passwordError.textContent = '비밀번호는 최소 8자이며 숫자와 특수문자를 포함해야합니다.'
        passwordError.style.display = 'block';
    } else {
        passwordError.style.display = 'none';
    }
});

// 비밀번호 확인 실시간 검사
confirmPasswordError.addEventListener('input', function(){
    const password = passwordInput.value;
    const confirmPassword = confirmPasswordInput.value;
    if (password != confirmPassword) {
        confirmPasswordError.textContent = '비밀번호가 일치하지 않으습니다';
        confirmPasswordError.style.display = 'block';
    } else {
        confirmPasswordError.style.display = 'none';
    }
})
