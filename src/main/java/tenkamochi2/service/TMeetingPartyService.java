package tenkamochi2.service;

import java.util.List;
import javax.annotation.Generated;
import tenkamochi2.entity.TMeetingParty;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TMeetingPartyNames.*;

/**
 * {@link TMeetingParty}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/19 22:50:37")
public class TMeetingPartyService extends AbstractService<TMeetingParty> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TMeetingParty findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TMeetingParty> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}