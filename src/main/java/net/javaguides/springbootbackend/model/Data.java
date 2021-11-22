// package net.javaguides.springbootbackend.model;

// public class Data {

//     private AppMenuModel appMenuModel;
//     private DrawerDetails drawerDetails;
//     private PromotionModel promotionModel;

//     public AppMenuModel getAppMenuModel() {
//         return appMenuModel;
//     }

//     public void setAppMenuModel(AppMenuModel appMenuModel) {
//         this.appMenuModel = appMenuModel;
//     }

//     public DrawerDetails getDrawerDetails() {
//         return drawerDetails;
//     }

//     public void setDrawerDetails(DrawerDetails drawerDetails) {
//         this.drawerDetails = drawerDetails;
//     }

//     public PromotionModel getPromotionModel() {
//         return promotionModel;
//     }

//     public void setPromotionModel(PromotionModel promotionModel) {
//         this.promotionModel = promotionModel;
//     }


// }

package net.javaguides.springbootbackend.model;

import java.util.List;

public class Data {

    private List<AppMenuModel> appMenuModel;
    private List<DrawerDetails> drawerDetails;
    private List<PromotionModel> promotionModel;

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
}
