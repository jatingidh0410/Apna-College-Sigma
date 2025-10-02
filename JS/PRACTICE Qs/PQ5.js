//Create a traffic light system that shows what to do based on color.

let trafficLight = 'Green';
if(trafficLight === 'Red'){
    console.log(`stop the vehical.`);
}else if (trafficLight === 'Yellow') {
    console.log(`Slow Down your vehical`);
} else if (trafficLight === 'Green') {
    console.log(`You can drive the vehical`);
}else{
    console.log(`Invalid O/P`);
}