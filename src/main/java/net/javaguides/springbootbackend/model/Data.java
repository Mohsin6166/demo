
package net.javaguides.springbootbackend.model;

import java.util.List;

public class Data {

    private List<AppMenuModel> appMenuModel;
    private List<DrawerDetails> drawerDetails;

    public List<AppMenuModel> getAppMenuModel() {
        return appMenuModel;
    }

    public void setAppMenuModel(List<AppMenuModel> appMenuModel) {
        this.appMenuModel = appMenuModel;
    }

    public List<DrawerDetails> getDrawerDetails() {
        return drawerDetails;
    }

    public void setDrawerDetails(List<DrawerDetails> drawerDetails) {
        this.drawerDetails = drawerDetails;
    }

    public List<PromotionModel> getPromotionModel() {
        return promotionModel;
    }

    public void setPromotionModel(List<PromotionModel> promotionModel) {
        this.promotionModel = promotionModel;
    }

    private List<PromotionModel> promotionModel;


}
