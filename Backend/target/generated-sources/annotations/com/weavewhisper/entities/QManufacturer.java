package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QManufacturer is a Querydsl query type for Manufacturer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QManufacturer extends EntityPathBase<Manufacturer> {

    private static final long serialVersionUID = 1222002973L;

    public static final QManufacturer manufacturer = new QManufacturer("manufacturer");

    public final QBaseUser _super = new QBaseUser(this);

    public final EnumPath<com.weavewhisper.enums.ManufacturerAccountStatusType> accountStatus = createEnum("accountStatus", com.weavewhisper.enums.ManufacturerAccountStatusType.class);

    public final StringPath brandName = createString("brandName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath email = _super.email;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath panNumber = createString("panNumber");

    //inherited
    public final StringPath password = _super.password;

    public final ListPath<Product, QProduct> productList = this.<Product, QProduct>createList("productList", Product.class, QProduct.class, PathInits.DIRECT2);

    //inherited
    public final EnumPath<com.weavewhisper.enums.UserType> type = _super.type;

    public QManufacturer(String variable) {
        super(Manufacturer.class, forVariable(variable));
    }

    public QManufacturer(Path<? extends Manufacturer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QManufacturer(PathMetadata metadata) {
        super(Manufacturer.class, metadata);
    }

}

