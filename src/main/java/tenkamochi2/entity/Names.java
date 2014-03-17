package tenkamochi2.entity;

import javax.annotation.Generated;
import tenkamochi2.entity.TClubNames._TClubNames;
import tenkamochi2.entity.TDrinkPartyNames._TDrinkPartyNames;
import tenkamochi2.entity.TMeetingPartyNames._TMeetingPartyNames;
import tenkamochi2.entity.TMemberClubNames._TMemberClubNames;
import tenkamochi2.entity.TMemberNames._TMemberNames;
import tenkamochi2.entity.TPartyAttendNames._TPartyAttendNames;
import tenkamochi2.entity.TPartyDrinkAttendNames._TPartyDrinkAttendNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2014/03/18 2:03:17")
public class Names {

    /**
     * {@link TClub}の名前クラスを返します。
     * 
     * @return TClubの名前クラス
     */
    public static _TClubNames tClub() {
        return new _TClubNames();
    }

    /**
     * {@link TDrinkParty}の名前クラスを返します。
     * 
     * @return TDrinkPartyの名前クラス
     */
    public static _TDrinkPartyNames tDrinkParty() {
        return new _TDrinkPartyNames();
    }

    /**
     * {@link TMeetingParty}の名前クラスを返します。
     * 
     * @return TMeetingPartyの名前クラス
     */
    public static _TMeetingPartyNames tMeetingParty() {
        return new _TMeetingPartyNames();
    }

    /**
     * {@link TMember}の名前クラスを返します。
     * 
     * @return TMemberの名前クラス
     */
    public static _TMemberNames tMember() {
        return new _TMemberNames();
    }

    /**
     * {@link TMemberClub}の名前クラスを返します。
     * 
     * @return TMemberClubの名前クラス
     */
    public static _TMemberClubNames tMemberClub() {
        return new _TMemberClubNames();
    }

    /**
     * {@link TPartyAttend}の名前クラスを返します。
     * 
     * @return TPartyAttendの名前クラス
     */
    public static _TPartyAttendNames tPartyAttend() {
        return new _TPartyAttendNames();
    }

    /**
     * {@link TPartyDrinkAttend}の名前クラスを返します。
     * 
     * @return TPartyDrinkAttendの名前クラス
     */
    public static _TPartyDrinkAttendNames tPartyDrinkAttend() {
        return new _TPartyDrinkAttendNames();
    }
}