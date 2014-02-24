package tenkamochi2.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TMeetingParty}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/19 22:50:32")
public class TMeetingPartyNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * drinkpartyIdのプロパティ名を返します。
     * 
     * @return drinkpartyIdのプロパティ名
     */
    public static PropertyName<Integer> drinkpartyId() {
        return new PropertyName<Integer>("drinkpartyId");
    }

    /**
     * partyNameのプロパティ名を返します。
     * 
     * @return partyNameのプロパティ名
     */
    public static PropertyName<String> partyName() {
        return new PropertyName<String>("partyName");
    }

    /**
     * partyNecessaryFlagのプロパティ名を返します。
     * 
     * @return partyNecessaryFlagのプロパティ名
     */
    public static PropertyName<Boolean> partyNecessaryFlag() {
        return new PropertyName<Boolean>("partyNecessaryFlag");
    }

    /**
     * partyTimeのプロパティ名を返します。
     * 
     * @return partyTimeのプロパティ名
     */
    public static PropertyName<Date> partyTime() {
        return new PropertyName<Date>("partyTime");
    }

    /**
     * partyRoomのプロパティ名を返します。
     * 
     * @return partyRoomのプロパティ名
     */
    public static PropertyName<String> partyRoom() {
        return new PropertyName<String>("partyRoom");
    }

    /**
     * partyMemoのプロパティ名を返します。
     * 
     * @return partyMemoのプロパティ名
     */
    public static PropertyName<String> partyMemo() {
        return new PropertyName<String>("partyMemo");
    }

    /**
     * partyDeadlineのプロパティ名を返します。
     * 
     * @return partyDeadlineのプロパティ名
     */
    public static PropertyName<Date> partyDeadline() {
        return new PropertyName<Date>("partyDeadline");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TMeetingPartyNames extends PropertyName<TMeetingParty> {

        /**
         * インスタンスを構築します。
         */
        public _TMeetingPartyNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TMeetingPartyNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TMeetingPartyNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * drinkpartyIdのプロパティ名を返します。
         *
         * @return drinkpartyIdのプロパティ名
         */
        public PropertyName<Integer> drinkpartyId() {
            return new PropertyName<Integer>(this, "drinkpartyId");
        }

        /**
         * partyNameのプロパティ名を返します。
         *
         * @return partyNameのプロパティ名
         */
        public PropertyName<String> partyName() {
            return new PropertyName<String>(this, "partyName");
        }

        /**
         * partyNecessaryFlagのプロパティ名を返します。
         *
         * @return partyNecessaryFlagのプロパティ名
         */
        public PropertyName<Boolean> partyNecessaryFlag() {
            return new PropertyName<Boolean>(this, "partyNecessaryFlag");
        }

        /**
         * partyTimeのプロパティ名を返します。
         *
         * @return partyTimeのプロパティ名
         */
        public PropertyName<Date> partyTime() {
            return new PropertyName<Date>(this, "partyTime");
        }

        /**
         * partyRoomのプロパティ名を返します。
         *
         * @return partyRoomのプロパティ名
         */
        public PropertyName<String> partyRoom() {
            return new PropertyName<String>(this, "partyRoom");
        }

        /**
         * partyMemoのプロパティ名を返します。
         *
         * @return partyMemoのプロパティ名
         */
        public PropertyName<String> partyMemo() {
            return new PropertyName<String>(this, "partyMemo");
        }

        /**
         * partyDeadlineのプロパティ名を返します。
         *
         * @return partyDeadlineのプロパティ名
         */
        public PropertyName<Date> partyDeadline() {
            return new PropertyName<Date>(this, "partyDeadline");
        }
    }
}