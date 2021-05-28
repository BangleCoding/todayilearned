function solution(brown, yellow) {

    
    var answer = []; 
    //brown + yellow가 return 된 가로, 세로 길이의 곱과 일치한다. 
    //카펫의 가로 길이는 세로 길이와 같거나 세로 길이보다 길다. 
    
    var totalCount = brown+yellow; //72 
    
    //hori==가로 
    //vert==세로
    for(var hori=1; hori<=totalCount; hori++){
        if(totalCount%hori ==0){
            //정수로 떨어지는 몫
            var vert = totalCount/hori;
            if(hori>=vert){
                //4x3의 정사각형이있다면 
                //vert==세로 brown의 최대갯수 
                //hori==가로 brown의 최대갯수 
                //yellow의 가로크기 = brown의 가로크기 -2 
                //yellow의 세로크기 = brown의 세로크기 -2 
                var yellHori = hori - 2; 
                var yellVert = vert - 2; 
                //console.log(hori, vert); //전체 사각형의 길이 
                //console.log(yellHori, yellVert);//내부 사각형의 길이 
                //내부 사각형을 둘러싸려면 ?
                //n줄의 사각형은 : 가로크기 * 2 + (2xn) +4(네 귀퉁이)
                var outRect = (yellHori * 2) + (2*yellVert) + 4;
                if(outRect==brown){
                    answer.push(hori, vert);
                }
            }
            
        }
    }
    
    return answer;
}
