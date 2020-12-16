package models;

import java.util.ArrayList;
import java.util.List;

public class LoanRequest {
    private List<LoanOffer> offers = new ArrayList<>();



    public void createOffer(LoanOffer offer) {
        this.offers.add(offer);
    }

    public LoanRequest getRequest(LoanRequest request) {
        return request;
    }

    public List<LoanOffer> getOffers() {
        return offers;
    }

    private class LoanOffer {
    }

}
