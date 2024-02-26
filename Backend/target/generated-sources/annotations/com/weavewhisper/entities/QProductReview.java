package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductReview is a Querydsl query type for ProductReview
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductReview extends EntityPathBase<ProductReview> {

    private static final long serialVersionUID = 1148618075L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductReview productReview = new QProductReview("productReview");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath customerFullName = createString("customerFullName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QProduct productRef;

    public final NumberPath<Integer> rating = createNumber("rating", Integer.class);

    public final StringPath review = createString("review");

    public QProductReview(String variable) {
        this(ProductReview.class, forVariable(variable), INITS);
    }

    public QProductReview(Path<? extends ProductReview> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductReview(PathMetadata metadata, PathInits inits) {
        this(ProductReview.class, metadata, inits);
    }

    public QProductReview(Class<? extends ProductReview> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productRef = inits.isInitialized("productRef") ? new QProduct(forProperty("productRef"), inits.get("productRef")) : null;
    }

}

