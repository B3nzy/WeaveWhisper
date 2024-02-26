package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCart is a Querydsl query type for Cart
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCart extends EntityPathBase<Cart> {

    private static final long serialVersionUID = -925455252L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCart cart = new QCart("cart");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final EnumPath<com.weavewhisper.enums.ColorType> color = createEnum("color", com.weavewhisper.enums.ColorType.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QCustomer customerRef;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProduct productRef;

    public final EnumPath<com.weavewhisper.enums.SizeType> size = createEnum("size", com.weavewhisper.enums.SizeType.class);

    public QCart(String variable) {
        this(Cart.class, forVariable(variable), INITS);
    }

    public QCart(Path<? extends Cart> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCart(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCart(PathMetadata metadata, PathInits inits) {
        this(Cart.class, metadata, inits);
    }

    public QCart(Class<? extends Cart> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customerRef = inits.isInitialized("customerRef") ? new QCustomer(forProperty("customerRef")) : null;
        this.productRef = inits.isInitialized("productRef") ? new QProduct(forProperty("productRef"), inits.get("productRef")) : null;
    }

}

