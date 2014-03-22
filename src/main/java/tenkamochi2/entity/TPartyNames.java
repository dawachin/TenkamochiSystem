package tenkamochi2.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import tenkamochi2.entity.TDrinkPartyNames._TDrinkPartyNames;
import tenkamochi2.entity.TMeetingPartyNames._TMeetingPartyNames;
import tenkamochi2.entity.TPartyAttendNames._TPartyAttendNames;

/**
 * {@link TParty}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/23 0:38:56")
public class TPartyNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * drinkIdのプロパティ名を返します。
     * 
     * @return drinkIdのプロパティ名
     */
    public static PropertyName<Integer> drinkId() {
        return new PropertyName<Integer>("drinkId");
    }

    /**
     * meetingIdのプロパティ名を返します。
     * 
     * @return meetingIdのプロパティ名
     */
    public static PropertyName<Integer> meetingId() {
        return new PropertyName<Integer>("meetingId");
    }

    /**
     * drinkのプロパティ名を返します。
     * 
     * @return drinkのプロパティ名
     */
    public static _TDrinkPartyNames drink() {
        return new _TDrinkPartyNames("drink");
    }

    /**
     * meetingのプロパティ名を返します。
     * 
     * @return meetingのプロパティ名
     */
    public static _TMeetingPartyNames meeting() {
        return new _TMeetingPartyNames("meeting");
    }

    /**
     * attendListのプロパティ名を返します。
     * 
     * @return attendListのプロパティ名
     */
    public static _TPartyAttendNames attendList() {
        return new _TPartyAttendNames("attendList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TPartyNames extends PropertyName<TParty> {

        /**
         * インスタンスを構築します。
         */
        public _TPartyNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TPartyNames(final String name) {
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
        public _TPartyNames(final PropertyName<?> parent, final String name) {
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
         * drinkIdのプロパティ名を返します。
         *
         * @return drinkIdのプロパティ名
         */
        public PropertyName<Integer> drinkId() {
            return new PropertyName<Integer>(this, "drinkId");
        }

        /**
         * meetingIdのプロパティ名を返します。
         *
         * @return meetingIdのプロパティ名
         */
        public PropertyName<Integer> meetingId() {
            return new PropertyName<Integer>(this, "meetingId");
        }

        /**
         * drinkのプロパティ名を返します。
         * 
         * @return drinkのプロパティ名
         */
        public _TDrinkPartyNames drink() {
            return new _TDrinkPartyNames(this, "drink");
        }

        /**
         * meetingのプロパティ名を返します。
         * 
         * @return meetingのプロパティ名
         */
        public _TMeetingPartyNames meeting() {
            return new _TMeetingPartyNames(this, "meeting");
        }

        /**
         * attendListのプロパティ名を返します。
         * 
         * @return attendListのプロパティ名
         */
        public _TPartyAttendNames attendList() {
            return new _TPartyAttendNames(this, "attendList");
        }
    }
}