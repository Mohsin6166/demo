package net.javaguides.springbootbackend.model;

public class Data {

    private DrawerDetails drawerDetails;
    private PromotionModel promotionModel;
    private AppMenuModel appMenuModel;

    public AppMenuModel getAppMenuModel() {
        return appMenuModel;
    }

    public void setAppMenuModel(AppMenuModel appMenuModel) {
        this.appMenuModel = appMenuModel;
    }

    public DrawerDetails getDrawerDetails() {
        return drawerDetails;
    }

    public void setDrawerDetails(DrawerDetails drawerDetails) {
        this.drawerDetails = drawerDetails;
    }

    public PromotionModel getPromotionModel() {
        return promotionModel;
    }

    public void setPromotionModel(PromotionModel promotionModel) {
        this.promotionModel = promotionModel;
    }


}
