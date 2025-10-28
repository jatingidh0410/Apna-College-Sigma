let arr1 = [10,20,30,40,50,60,70,100,80,90,110,120,130,140,150,160];

let ans = arr1.every((el)=>{ // el%10==0
    if(el % 10==0){
       return true;
    }else{
        false;
    }
});

console.log(ans);


let min =  arr1.reduce((prev,el)=>{
    if(prev < el){
        return prev;
    }else{
        return el;
    }
});
console.log(min);