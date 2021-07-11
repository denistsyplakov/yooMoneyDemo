function pay() {
    $.post({
        url: "/payment",
        data: {amount: 10},
    }).done(function (data) {
        alert("done: "+data.uuid);
    })
        .fail(function () {
            alert("I'm sorry Dave, I'm afraid I can't do that.");
        });
}

function setupIndexPage(){
    $( "#btn_pay" ).click(() => {
        pay();
    });
    console.log("Main page controls setup done.")
}

