package tenkamochi2.service;

import java.util.List;
import javax.annotation.Generated;
import tenkamochi2.entity.TClub;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TClubNames.*;

/**
 * {@link TClub}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/03/09 1:40:12")
public class TClubService extends AbstractService<TClub> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TClub findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TClub> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}