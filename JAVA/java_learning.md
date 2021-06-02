```java
//Queue 


import java.util.LinkedList;
import java.util.Queue; 


Queue<int> intQue = new LinkedList<>();
Queue<String> strQue = new LinkedList<>();

```

- pick과 pull의 차이는? 
  - pick:참조
  - pull:반환 후 제거 


```java

package com.yura;

public class SortingString {
	
	public static String str;

	public static void main(String[] args) {
  
  str = "test"; 

	for(int i =0; i<str.length(); i++) {
		if(Character.isLetter(str.charAt(i))) {
      //알파벳일 경우 리스트에 삽입
			result.add(str.charAt(i)); 
		}else {
        //숫자일 경우 덧셈 
  			value += str.charAt(i);  /* String str이 char로 return 된 채 누적됨 */ 
  			value += str.charAt(i) - '0' ; /* char 에서 integer 로 간단한 형변환~!!*/
		}
	}
	
	//알파벳을 오름차순으로 정렬
	Collections.sort(result);
	
	for(int i=0; i<result.size(); i++) {
		System.out.print(result.get(i));
	}
	
	if(value !=0) System.out.print(value);
	System.out.println();

	}
}

```
