package tenkamochi2.service;

import java.util.List;
import javax.annotation.Generated;
import tenkamochi2.entity.TMemberClub;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TMemberClubNames.*;

/**
 * {@link TMemberClub}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/03/09 1:53:10")
public class TMemberClubService extends AbstractService<TMemberClub> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TMemberClub findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TMemberClub> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}