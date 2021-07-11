function pay() {
    $.post({
        url: "/payment",
        data: {amount: 10},
    }).done(function (data) {
        const checkout = new window.YooMoneyCheckoutWidget({
            confirmation_token: data.confirmationToken,
            return_url: 'http://localhost:8080/',
            error_callback: function (error) {
                console.error(error);
            }
        });
        checkout.render('yooWidget').then(() => {
                console.log("All OK")
            });
    }).fail(function () {
        alert("I'm sorry Dave, I'm afraid I can't do that.");
    });
}

function setupIndexPage() {
    $("#btn_pay").click(() => {
        pay();
    });
    console.log("Main page controls setup done.")
}

