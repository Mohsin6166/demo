package net.javaguides.springbootbackend.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "homemenus")
public class HomeModel {
    private AppMenuModel appMenuModel;
    private PromotionModel promotionModel;
    private DrawerDetails drawerDetails;

    public AppMenuModel getAppMenuModel() {
        return appMenuModel;
    }

    public void setAppMenuModel(AppMenuModel appMenuModel) {
        this.appMenuModel = appMenuModel;
    }

    public PromotionModel getPromotionModel() {
        return promotionModel;
    }

    public void setPromotionModel(PromotionModel promotionModel) {
        this.promotionModel = promotionModel;
    }

    public DrawerDetails getDrawerDetails() {
        return drawerDetails;
    }

    public void setDrawerDetails(DrawerDetails drawerDetails) {
        this.drawerDetails = drawerDetails;
    }
}
