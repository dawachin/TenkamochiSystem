package tenkamochi2.service;

import java.util.List;

import javax.annotation.Generated;

import tenkamochi2.entity.TParty;
import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TPartyNames.*;

/**
 * {@link TParty}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/18 6:58:23")
public class TPartyService extends AbstractService<TParty> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TParty findById(Integer id) {
        return select().id(id).getSingleResult();
    }
    
    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public List<TParty>findById() {
        return select().orderBy(desc(id())).getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TParty> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}