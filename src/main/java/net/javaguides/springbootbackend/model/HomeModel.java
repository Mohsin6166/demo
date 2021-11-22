// package net.javaguides.springbootbackend.model;


// import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "homemenus")
// public class HomeModel {

//     private Meta meta;
//     private Data data;

//     public Meta getMeta() {
//         return meta;
//     }

//     public void setMeta(Meta meta) {
//         this.meta = meta;
//     }

//     public Data getData() {
//         return data;
//     }

//     public void setData(Data data) {
//         this.data = data;
//     }
// }



package net.javaguides.springbootbackend.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "homemenus")
public class HomeModel {
    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private Meta meta;
    private List<Data> data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
