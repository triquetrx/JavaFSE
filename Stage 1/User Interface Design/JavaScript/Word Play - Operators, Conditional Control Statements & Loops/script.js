function wordPlay(number){
    //fill the code
    if(number>50){
        return "Range is High";
    }
    else if(number<1){
        return "Not Valid";
    }
    else{
        let str = '';
        for(let i=1;i<=number;i++){
            if(i%3===0){
                str+=" ";
                str+=("Tap");
            }
            if(i%5===0){
                str+=" ";
                str+=("Clap");
            }
            if(i%3===0 && i%5===0){
                str+=" ";
                str+=("Jump");
            }
            if(!(i%3===0 || i%5===0)){
                str+=" ";
                str+=(i);
            }
        }
        return(str);
    }
}
