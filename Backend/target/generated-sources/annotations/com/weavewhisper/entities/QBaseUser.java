package com.weavewhisper.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseUser is a Querydsl query type for BaseUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBaseUser extends EntityPathBase<BaseUser> {

    private static final long serialVersionUID = -2068102776L;

    public static final QBaseUser baseUser = new QBaseUser("baseUser");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath password = createString("password");

    public final EnumPath<com.weavewhisper.enums.UserType> type = createEnum("type", com.weavewhisper.enums.UserType.class);

    public QBaseUser(String variable) {
        super(BaseUser.class, forVariable(variable));
    }

    public QBaseUser(Path<? extends BaseUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseUser(PathMetadata metadata) {
        super(BaseUser.class, metadata);
    }

}

