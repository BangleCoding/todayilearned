### javascript 정리 노트

### var, let, const 차이점 
- var은 function-scoped, let, const는 block-scoped 
- let은 변수 재할당 가능
- const는 변수 재선언, 재할당 모두 불가능 


#### String 
##### String 자르기 

##### split : separateor 구분자를 기준으로 문자열을 자름 
```javascript
str.split([separator[, limit]]); 

//ex)
var str = lets do it;
str.split(''); 
alert(str); // lets , do , it  
```

##### substring : 시작 인덱스부터 종료 인덱스까지의 문자열을 반환함 
```javascript
str.substring(indexStart[, indexEnd])
```


JSON to String 

##### String 공백 제거
```javacript
str.trim()
```


#### for 문 
```javascript
 for (let i = size; i < str.length; i += size){} 
```
