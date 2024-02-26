package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 259533610L;

    public static final QCustomer customer = new QCustomer("customer");

    public final QBaseUser _super = new QBaseUser(this);

    public final StringPath address = createString("address");

    public final NumberPath<Double> balance = createNumber("balance", Double.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath email = _super.email;

    public final StringPath fullName = createString("fullName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath password = _super.password;

    public final StringPath phoneNumber = createString("phoneNumber");

    //inherited
    public final EnumPath<com.weavewhisper.enums.UserType> type = _super.type;

    public final BooleanPath verified = createBoolean("verified");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata);
    }

}

