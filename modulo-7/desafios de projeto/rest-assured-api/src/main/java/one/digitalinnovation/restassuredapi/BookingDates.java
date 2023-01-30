package one.digitalinnovation.restassuredapi;

public class BookingDates {

    private String checkin;
    private String checkout;

    public BookingDates(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    private String getCheckin() {
        return checkin;
    }

    private void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    private String getCheckout() {
        return checkout;
    }

    private void setCheckout(String checkout) {
        this.checkout = checkout;
    }

}
