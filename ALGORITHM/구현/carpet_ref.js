//프로그래머스>완전탐색>카펫 문제 
//https://programmers.co.kr/learn/courses/30/lessons/42842

function solution(brown,yellow) {
	var answer =[];
    //i는 세로의 갯수
    //i의 최소 길이가 3이여야 카펫 성립 가능   
  for(var i=3; i<=(brown+yellow)/i; i++){ 
    	var x = Math.floor((brown+yellow)/i); 
        if((x-2)*(i-2)===yellow){
        	break;
        }
    }
 
  return [x,i]; 
}
