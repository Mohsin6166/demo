package net.javaguides.springbootbackend.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Data {

    private List<DrawerDetails> drawerDetails;
    private List<PromotionModel> promotionModel;
    private List<AppMenuModel> appMenuModel;
    private List<ProductModel> productModel;

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

    public List<AppMenuModel> getAppMenuModel() {
        return appMenuModel;
    }

    public void setAppMenuModel(List<AppMenuModel> appMenuModel) {
        this.appMenuModel = appMenuModel;
    }

    public List<ProductModel> getProductModel() {
        return productModel;
    }

    public void setProductModel(List<ProductModel> productModel) {
        this.productModel = productModel;
    }
}
