function circle()
{
	console.log("This is Circle method ");
	setTimeout(area,3000);
	setTimeout(perimeter,4000);
	new Promise((resolve,reject)=>
	resolve("ok")
	).then(resolve=>console.log(resolve));
}
circle();
function area()
{
	var radius=5;
	var areaCircle = 3.14 * radius *radius;
	console.log("Area of circle :"+areaCircle)
}
function perimeter()
{
	var r=4;
	var perim = 2 * 3.14 *r;
	console.log("Perimeter of circle :"+perim);

}
	