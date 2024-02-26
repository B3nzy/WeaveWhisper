package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderHistory is a Querydsl query type for OrderHistory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderHistory extends EntityPathBase<OrderHistory> {

    private static final long serialVersionUID = 713352882L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderHistory orderHistory = new QOrderHistory("orderHistory");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final EnumPath<com.weavewhisper.enums.ColorType> color = createEnum("color", com.weavewhisper.enums.ColorType.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QCustomer customerRef;

    public final DateTimePath<java.time.LocalDateTime> deliveredAt = createDateTime("deliveredAt", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QManufacturer manufacturer;

    public final EnumPath<com.weavewhisper.enums.OrderStatusType> orderStatus = createEnum("orderStatus", com.weavewhisper.enums.OrderStatusType.class);

    public final EnumPath<com.weavewhisper.enums.PaymentType> paymentType = createEnum("paymentType", com.weavewhisper.enums.PaymentType.class);

    public final StringPath phoneNumber = createString("phoneNumber");

    public final QProduct productRef;

    public final StringPath razorpayOrderId = createString("razorpayOrderId");

    public final StringPath razorpayPaymentId = createString("razorpayPaymentId");

    public final StringPath razorpaySignature = createString("razorpaySignature");

    public final StringPath receipt = createString("receipt");

    public final EnumPath<com.weavewhisper.enums.OrderReturnStatusType> returnStatus = createEnum("returnStatus", com.weavewhisper.enums.OrderReturnStatusType.class);

    public final EnumPath<com.weavewhisper.enums.SizeType> size = createEnum("size", com.weavewhisper.enums.SizeType.class);

    public final NumberPath<Double> soldAtPrice = createNumber("soldAtPrice", Double.class);

    public QOrderHistory(String variable) {
        this(OrderHistory.class, forVariable(variable), INITS);
    }

    public QOrderHistory(Path<? extends OrderHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderHistory(PathMetadata metadata, PathInits inits) {
        this(OrderHistory.class, metadata, inits);
    }

    public QOrderHistory(Class<? extends OrderHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customerRef = inits.isInitialized("customerRef") ? new QCustomer(forProperty("customerRef")) : null;
        this.manufacturer = inits.isInitialized("manufacturer") ? new QManufacturer(forProperty("manufacturer")) : null;
        this.productRef = inits.isInitialized("productRef") ? new QProduct(forProperty("productRef"), inits.get("productRef")) : null;
    }

}

