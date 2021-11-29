package net.javaguides.springbootbackend.model;

import org.springframework.stereotype.Service;

@Service

public class Data {

    private DrawerDetails drawerDetails;
    private PromotionModel promotionModel;
    private AppMenuModel appMenuModel;
    private ProductModel productModel;

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

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
