package tenkamochi2.service;

import java.util.List;
import javax.annotation.Generated;
import tenkamochi2.entity.TDrinkParty;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TDrinkPartyNames.*;

/**
 * {@link TDrinkParty}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/19 22:30:45")
public class TDrinkPartyService extends AbstractService<TDrinkParty> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TDrinkParty findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TDrinkParty> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}