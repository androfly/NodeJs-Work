function  placeAnOrder(orderNumber) {
    console.log("Customer order : " + orderNumber) ;

    cookAndDeliverFood(function () {
       console.log("Delivered Food order : " + orderNumber) ;
    });

}

// Simulate a 5 seconds operation
function cookAndDeliverFood(callback) {
    setTimeout(callback , 5000) ;
}

// Simulate users web requests

placeAnOrder(1);
placeAnOrder(2);
placeAnOrder(3);
placeAnOrder(4);
placeAnOrder(5);
placeAnOrder(6);


