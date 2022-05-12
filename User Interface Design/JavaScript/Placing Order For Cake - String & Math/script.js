function OrderCake(str) {
	//fill the code
	let weight = (Number(str.slice(0,4))/1000);
	let price = Number(weight)*450;
	let orderId = str.slice(str.length-3);
	let name = str.slice(4,str.length-3);
	return ("Your order for "+Math.round(weight)+" kg "+name+" cake has been taken. You are requested to pay Rs. "+Math.round(price)+" on the order no "+orderId);
}
