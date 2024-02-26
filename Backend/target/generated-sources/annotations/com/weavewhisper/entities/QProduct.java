package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -1706129373L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Double> actualPrice = createNumber("actualPrice", Double.class);

    public final EnumPath<com.weavewhisper.enums.CategoryType> category = createEnum("category", com.weavewhisper.enums.CategoryType.class);

    public final SetPath<ProductColor, QProductColor> colorSet = this.<ProductColor, QProductColor>createSet("colorSet", ProductColor.class, QProductColor.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath description = createString("description");

    public final EnumPath<com.weavewhisper.enums.GenderType> gender = createEnum("gender", com.weavewhisper.enums.GenderType.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ListPath<ProductImage, QProductImage> imageList = this.<ProductImage, QProductImage>createList("imageList", ProductImage.class, QProductImage.class, PathInits.DIRECT2);

    public final NumberPath<Integer> inventoryCount = createNumber("inventoryCount", Integer.class);

    public final QManufacturer manufacturer;

    public final StringPath name = createString("name");

    public final ListPath<ProductReview, QProductReview> reviewList = this.<ProductReview, QProductReview>createList("reviewList", ProductReview.class, QProductReview.class, PathInits.DIRECT2);

    public final NumberPath<Double> sellingPrice = createNumber("sellingPrice", Double.class);

    public final SetPath<ProductSize, QProductSize> sizeSet = this.<ProductSize, QProductSize>createSet("sizeSet", ProductSize.class, QProductSize.class, PathInits.DIRECT2);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.manufacturer = inits.isInitialized("manufacturer") ? new QManufacturer(forProperty("manufacturer")) : null;
    }

}

