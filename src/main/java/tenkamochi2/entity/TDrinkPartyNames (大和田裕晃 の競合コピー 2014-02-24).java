package tenkamochi2.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TDrinkParty}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/19 22:50:32")
public class TDrinkPartyNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * partyIdのプロパティ名を返します。
     * 
     * @return partyIdのプロパティ名
     */
    public static PropertyName<Integer> partyId() {
        return new PropertyName<Integer>("partyId");
    }

    /**
     * drunkPartyTimeのプロパティ名を返します。
     * 
     * @return drunkPartyTimeのプロパティ名
     */
    public static PropertyName<Date> drunkPartyTime() {
        return new PropertyName<Date>("drunkPartyTime");
    }

    /**
     * drunkPartyRoomのプロパティ名を返します。
     * 
     * @return drunkPartyRoomのプロパティ名
     */
    public static PropertyName<String> drunkPartyRoom() {
        return new PropertyName<String>("drunkPartyRoom");
    }

    /**
     * drunkPartyMemoのプロパティ名を返します。
     * 
     * @return drunkPartyMemoのプロパティ名
     */
    public static PropertyName<String> drunkPartyMemo() {
        return new PropertyName<String>("drunkPartyMemo");
    }

    /**
     * drunkPartyDeadlineのプロパティ名を返します。
     * 
     * @return drunkPartyDeadlineのプロパティ名
     */
    public static PropertyName<Date> drunkPartyDeadline() {
        return new PropertyName<Date>("drunkPartyDeadline");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TDrinkPartyNames extends PropertyName<TDrinkParty> {

        /**
         * インスタンスを構築します。
         */
        public _TDrinkPartyNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TDrinkPartyNames(final String name) {
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
        public _TDrinkPartyNames(final PropertyName<?> parent, final String name) {
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
         * partyIdのプロパティ名を返します。
         *
         * @return partyIdのプロパティ名
         */
        public PropertyName<Integer> partyId() {
            return new PropertyName<Integer>(this, "partyId");
        }

        /**
         * drunkPartyTimeのプロパティ名を返します。
         *
         * @return drunkPartyTimeのプロパティ名
         */
        public PropertyName<Date> drunkPartyTime() {
            return new PropertyName<Date>(this, "drunkPartyTime");
        }

        /**
         * drunkPartyRoomのプロパティ名を返します。
         *
         * @return drunkPartyRoomのプロパティ名
         */
        public PropertyName<String> drunkPartyRoom() {
            return new PropertyName<String>(this, "drunkPartyRoom");
        }

        /**
         * drunkPartyMemoのプロパティ名を返します。
         *
         * @return drunkPartyMemoのプロパティ名
         */
        public PropertyName<String> drunkPartyMemo() {
            return new PropertyName<String>(this, "drunkPartyMemo");
        }

        /**
         * drunkPartyDeadlineのプロパティ名を返します。
         *
         * @return drunkPartyDeadlineのプロパティ名
         */
        public PropertyName<Date> drunkPartyDeadline() {
            return new PropertyName<Date>(this, "drunkPartyDeadline");
        }
    }
}