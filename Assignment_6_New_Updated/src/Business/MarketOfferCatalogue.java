/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author JAI JINENDRA
 */
public class MarketOfferCatalogue {

    private ArrayList<MarketOffer> marketOfferCatalogue;

    public ArrayList<MarketOffer> getOfferCatalogue() {
        return marketOfferCatalogue;
    }

    public void setOfferCatalogue(ArrayList<MarketOffer> offerCatalogue) {
        this.marketOfferCatalogue = offerCatalogue;
    }

    public MarketOfferCatalogue() {
        marketOfferCatalogue = new ArrayList<MarketOffer>();
    }

}
