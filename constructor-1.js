const makeObjectOne = (idvalue, passwordValue, emailValue) => {
  // 리턴 데이터 타입을 객체로 만들고, '정적인' key 값에 '동적인' value 값을 매개변수를 통해 만들었다
  // '매개변수 인자를 객체에 전달했다' 라고 표현했다
  return {
    id : idvalue,
    password : passwordValue,
    emai : emailValue
  }
};

// 함수 makeObjectOne()은 객체를 리턴했기 때문에, result 변수는 사실상 객체를 담은 변수이다.
let result = makeObjectOne('아이디테스트', '패스워드테스트', '이메일 테스트');
console.log(result);