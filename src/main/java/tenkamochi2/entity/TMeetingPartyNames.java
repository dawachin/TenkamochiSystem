package tenkamochi2.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import tenkamochi2.entity.TPartyNames._TPartyNames;

/**
 * {@link TMeetingParty}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/25 17:42:08")
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
     * meetingNameのプロパティ名を返します。
     * 
     * @return meetingNameのプロパティ名
     */
    public static PropertyName<String> meetingName() {
        return new PropertyName<String>("meetingName");
    }

    /**
     * meetingNecessaryFlagのプロパティ名を返します。
     * 
     * @return meetingNecessaryFlagのプロパティ名
     */
    public static PropertyName<Boolean> meetingNecessaryFlag() {
        return new PropertyName<Boolean>("meetingNecessaryFlag");
    }

    /**
     * meetingTimeのプロパティ名を返します。
     * 
     * @return meetingTimeのプロパティ名
     */
    public static PropertyName<Date> meetingTime() {
        return new PropertyName<Date>("meetingTime");
    }

    /**
     * meetingRoomのプロパティ名を返します。
     * 
     * @return meetingRoomのプロパティ名
     */
    public static PropertyName<String> meetingRoom() {
        return new PropertyName<String>("meetingRoom");
    }

    /**
     * meetingMemoのプロパティ名を返します。
     * 
     * @return meetingMemoのプロパティ名
     */
    public static PropertyName<String> meetingMemo() {
        return new PropertyName<String>("meetingMemo");
    }

    /**
     * meetingDeadlineのプロパティ名を返します。
     * 
     * @return meetingDeadlineのプロパティ名
     */
    public static PropertyName<Date> meetingDeadline() {
        return new PropertyName<Date>("meetingDeadline");
    }

    /**
     * tPartyのプロパティ名を返します。
     * 
     * @return tPartyのプロパティ名
     */
    public static _TPartyNames tParty() {
        return new _TPartyNames("tParty");
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
         * meetingNameのプロパティ名を返します。
         *
         * @return meetingNameのプロパティ名
         */
        public PropertyName<String> meetingName() {
            return new PropertyName<String>(this, "meetingName");
        }

        /**
         * meetingNecessaryFlagのプロパティ名を返します。
         *
         * @return meetingNecessaryFlagのプロパティ名
         */
        public PropertyName<Boolean> meetingNecessaryFlag() {
            return new PropertyName<Boolean>(this, "meetingNecessaryFlag");
        }

        /**
         * meetingTimeのプロパティ名を返します。
         *
         * @return meetingTimeのプロパティ名
         */
        public PropertyName<Date> meetingTime() {
            return new PropertyName<Date>(this, "meetingTime");
        }

        /**
         * meetingRoomのプロパティ名を返します。
         *
         * @return meetingRoomのプロパティ名
         */
        public PropertyName<String> meetingRoom() {
            return new PropertyName<String>(this, "meetingRoom");
        }

        /**
         * meetingMemoのプロパティ名を返します。
         *
         * @return meetingMemoのプロパティ名
         */
        public PropertyName<String> meetingMemo() {
            return new PropertyName<String>(this, "meetingMemo");
        }

        /**
         * meetingDeadlineのプロパティ名を返します。
         *
         * @return meetingDeadlineのプロパティ名
         */
        public PropertyName<Date> meetingDeadline() {
            return new PropertyName<Date>(this, "meetingDeadline");
        }

        /**
         * tPartyのプロパティ名を返します。
         * 
         * @return tPartyのプロパティ名
         */
        public _TPartyNames tParty() {
            return new _TPartyNames(this, "tParty");
        }
    }
}