package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSShopnameIsNull() {
            addCriterion("s_shopName is null");
            return (Criteria) this;
        }

        public Criteria andSShopnameIsNotNull() {
            addCriterion("s_shopName is not null");
            return (Criteria) this;
        }

        public Criteria andSShopnameEqualTo(String value) {
            addCriterion("s_shopName =", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameNotEqualTo(String value) {
            addCriterion("s_shopName <>", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameGreaterThan(String value) {
            addCriterion("s_shopName >", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("s_shopName >=", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameLessThan(String value) {
            addCriterion("s_shopName <", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameLessThanOrEqualTo(String value) {
            addCriterion("s_shopName <=", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameLike(String value) {
            addCriterion("s_shopName like", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameNotLike(String value) {
            addCriterion("s_shopName not like", value, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameIn(List<String> values) {
            addCriterion("s_shopName in", values, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameNotIn(List<String> values) {
            addCriterion("s_shopName not in", values, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameBetween(String value1, String value2) {
            addCriterion("s_shopName between", value1, value2, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSShopnameNotBetween(String value1, String value2) {
            addCriterion("s_shopName not between", value1, value2, "sShopname");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNull() {
            addCriterion("s_address is null");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNotNull() {
            addCriterion("s_address is not null");
            return (Criteria) this;
        }

        public Criteria andSAddressEqualTo(String value) {
            addCriterion("s_address =", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotEqualTo(String value) {
            addCriterion("s_address <>", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThan(String value) {
            addCriterion("s_address >", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThanOrEqualTo(String value) {
            addCriterion("s_address >=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThan(String value) {
            addCriterion("s_address <", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThanOrEqualTo(String value) {
            addCriterion("s_address <=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLike(String value) {
            addCriterion("s_address like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotLike(String value) {
            addCriterion("s_address not like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressIn(List<String> values) {
            addCriterion("s_address in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotIn(List<String> values) {
            addCriterion("s_address not in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressBetween(String value1, String value2) {
            addCriterion("s_address between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotBetween(String value1, String value2) {
            addCriterion("s_address not between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIsNull() {
            addCriterion("s_telephone is null");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIsNotNull() {
            addCriterion("s_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andSTelephoneEqualTo(String value) {
            addCriterion("s_telephone =", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotEqualTo(String value) {
            addCriterion("s_telephone <>", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneGreaterThan(String value) {
            addCriterion("s_telephone >", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_telephone >=", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLessThan(String value) {
            addCriterion("s_telephone <", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLessThanOrEqualTo(String value) {
            addCriterion("s_telephone <=", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLike(String value) {
            addCriterion("s_telephone like", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotLike(String value) {
            addCriterion("s_telephone not like", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIn(List<String> values) {
            addCriterion("s_telephone in", values, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotIn(List<String> values) {
            addCriterion("s_telephone not in", values, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneBetween(String value1, String value2) {
            addCriterion("s_telephone between", value1, value2, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotBetween(String value1, String value2) {
            addCriterion("s_telephone not between", value1, value2, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicIsNull() {
            addCriterion("s_characteristic is null");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicIsNotNull() {
            addCriterion("s_characteristic is not null");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicEqualTo(String value) {
            addCriterion("s_characteristic =", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicNotEqualTo(String value) {
            addCriterion("s_characteristic <>", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicGreaterThan(String value) {
            addCriterion("s_characteristic >", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicGreaterThanOrEqualTo(String value) {
            addCriterion("s_characteristic >=", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicLessThan(String value) {
            addCriterion("s_characteristic <", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicLessThanOrEqualTo(String value) {
            addCriterion("s_characteristic <=", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicLike(String value) {
            addCriterion("s_characteristic like", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicNotLike(String value) {
            addCriterion("s_characteristic not like", value, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicIn(List<String> values) {
            addCriterion("s_characteristic in", values, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicNotIn(List<String> values) {
            addCriterion("s_characteristic not in", values, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicBetween(String value1, String value2) {
            addCriterion("s_characteristic between", value1, value2, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSCharacteristicNotBetween(String value1, String value2) {
            addCriterion("s_characteristic not between", value1, value2, "sCharacteristic");
            return (Criteria) this;
        }

        public Criteria andSActivityIsNull() {
            addCriterion("s_activity is null");
            return (Criteria) this;
        }

        public Criteria andSActivityIsNotNull() {
            addCriterion("s_activity is not null");
            return (Criteria) this;
        }

        public Criteria andSActivityEqualTo(String value) {
            addCriterion("s_activity =", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityNotEqualTo(String value) {
            addCriterion("s_activity <>", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityGreaterThan(String value) {
            addCriterion("s_activity >", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityGreaterThanOrEqualTo(String value) {
            addCriterion("s_activity >=", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityLessThan(String value) {
            addCriterion("s_activity <", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityLessThanOrEqualTo(String value) {
            addCriterion("s_activity <=", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityLike(String value) {
            addCriterion("s_activity like", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityNotLike(String value) {
            addCriterion("s_activity not like", value, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityIn(List<String> values) {
            addCriterion("s_activity in", values, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityNotIn(List<String> values) {
            addCriterion("s_activity not in", values, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityBetween(String value1, String value2) {
            addCriterion("s_activity between", value1, value2, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSActivityNotBetween(String value1, String value2) {
            addCriterion("s_activity not between", value1, value2, "sActivity");
            return (Criteria) this;
        }

        public Criteria andSParkingIsNull() {
            addCriterion("s_parking is null");
            return (Criteria) this;
        }

        public Criteria andSParkingIsNotNull() {
            addCriterion("s_parking is not null");
            return (Criteria) this;
        }

        public Criteria andSParkingEqualTo(String value) {
            addCriterion("s_parking =", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingNotEqualTo(String value) {
            addCriterion("s_parking <>", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingGreaterThan(String value) {
            addCriterion("s_parking >", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingGreaterThanOrEqualTo(String value) {
            addCriterion("s_parking >=", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingLessThan(String value) {
            addCriterion("s_parking <", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingLessThanOrEqualTo(String value) {
            addCriterion("s_parking <=", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingLike(String value) {
            addCriterion("s_parking like", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingNotLike(String value) {
            addCriterion("s_parking not like", value, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingIn(List<String> values) {
            addCriterion("s_parking in", values, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingNotIn(List<String> values) {
            addCriterion("s_parking not in", values, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingBetween(String value1, String value2) {
            addCriterion("s_parking between", value1, value2, "sParking");
            return (Criteria) this;
        }

        public Criteria andSParkingNotBetween(String value1, String value2) {
            addCriterion("s_parking not between", value1, value2, "sParking");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursIsNull() {
            addCriterion("s_businessHours is null");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursIsNotNull() {
            addCriterion("s_businessHours is not null");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursEqualTo(String value) {
            addCriterion("s_businessHours =", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursNotEqualTo(String value) {
            addCriterion("s_businessHours <>", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursGreaterThan(String value) {
            addCriterion("s_businessHours >", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursGreaterThanOrEqualTo(String value) {
            addCriterion("s_businessHours >=", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursLessThan(String value) {
            addCriterion("s_businessHours <", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursLessThanOrEqualTo(String value) {
            addCriterion("s_businessHours <=", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursLike(String value) {
            addCriterion("s_businessHours like", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursNotLike(String value) {
            addCriterion("s_businessHours not like", value, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursIn(List<String> values) {
            addCriterion("s_businessHours in", values, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursNotIn(List<String> values) {
            addCriterion("s_businessHours not in", values, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursBetween(String value1, String value2) {
            addCriterion("s_businessHours between", value1, value2, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSBusinesshoursNotBetween(String value1, String value2) {
            addCriterion("s_businessHours not between", value1, value2, "sBusinesshours");
            return (Criteria) this;
        }

        public Criteria andSWifiIsNull() {
            addCriterion("s_wifi is null");
            return (Criteria) this;
        }

        public Criteria andSWifiIsNotNull() {
            addCriterion("s_wifi is not null");
            return (Criteria) this;
        }

        public Criteria andSWifiEqualTo(String value) {
            addCriterion("s_wifi =", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiNotEqualTo(String value) {
            addCriterion("s_wifi <>", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiGreaterThan(String value) {
            addCriterion("s_wifi >", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiGreaterThanOrEqualTo(String value) {
            addCriterion("s_wifi >=", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiLessThan(String value) {
            addCriterion("s_wifi <", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiLessThanOrEqualTo(String value) {
            addCriterion("s_wifi <=", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiLike(String value) {
            addCriterion("s_wifi like", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiNotLike(String value) {
            addCriterion("s_wifi not like", value, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiIn(List<String> values) {
            addCriterion("s_wifi in", values, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiNotIn(List<String> values) {
            addCriterion("s_wifi not in", values, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiBetween(String value1, String value2) {
            addCriterion("s_wifi between", value1, value2, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSWifiNotBetween(String value1, String value2) {
            addCriterion("s_wifi not between", value1, value2, "sWifi");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNull() {
            addCriterion("s_price is null");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNotNull() {
            addCriterion("s_price is not null");
            return (Criteria) this;
        }

        public Criteria andSPriceEqualTo(String value) {
            addCriterion("s_price =", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotEqualTo(String value) {
            addCriterion("s_price <>", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThan(String value) {
            addCriterion("s_price >", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThanOrEqualTo(String value) {
            addCriterion("s_price >=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThan(String value) {
            addCriterion("s_price <", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThanOrEqualTo(String value) {
            addCriterion("s_price <=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLike(String value) {
            addCriterion("s_price like", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotLike(String value) {
            addCriterion("s_price not like", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceIn(List<String> values) {
            addCriterion("s_price in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotIn(List<String> values) {
            addCriterion("s_price not in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceBetween(String value1, String value2) {
            addCriterion("s_price between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotBetween(String value1, String value2) {
            addCriterion("s_price not between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNull() {
            addCriterion("s_score is null");
            return (Criteria) this;
        }

        public Criteria andSScoreIsNotNull() {
            addCriterion("s_score is not null");
            return (Criteria) this;
        }

        public Criteria andSScoreEqualTo(Double value) {
            addCriterion("s_score =", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotEqualTo(Double value) {
            addCriterion("s_score <>", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThan(Double value) {
            addCriterion("s_score >", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("s_score >=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThan(Double value) {
            addCriterion("s_score <", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreLessThanOrEqualTo(Double value) {
            addCriterion("s_score <=", value, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreIn(List<Double> values) {
            addCriterion("s_score in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotIn(List<Double> values) {
            addCriterion("s_score not in", values, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreBetween(Double value1, Double value2) {
            addCriterion("s_score between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSScoreNotBetween(Double value1, Double value2) {
            addCriterion("s_score not between", value1, value2, "sScore");
            return (Criteria) this;
        }

        public Criteria andSIntroduceIsNull() {
            addCriterion("s_introduce is null");
            return (Criteria) this;
        }

        public Criteria andSIntroduceIsNotNull() {
            addCriterion("s_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andSIntroduceEqualTo(String value) {
            addCriterion("s_introduce =", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceNotEqualTo(String value) {
            addCriterion("s_introduce <>", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceGreaterThan(String value) {
            addCriterion("s_introduce >", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("s_introduce >=", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceLessThan(String value) {
            addCriterion("s_introduce <", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceLessThanOrEqualTo(String value) {
            addCriterion("s_introduce <=", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceLike(String value) {
            addCriterion("s_introduce like", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceNotLike(String value) {
            addCriterion("s_introduce not like", value, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceIn(List<String> values) {
            addCriterion("s_introduce in", values, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceNotIn(List<String> values) {
            addCriterion("s_introduce not in", values, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceBetween(String value1, String value2) {
            addCriterion("s_introduce between", value1, value2, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSIntroduceNotBetween(String value1, String value2) {
            addCriterion("s_introduce not between", value1, value2, "sIntroduce");
            return (Criteria) this;
        }

        public Criteria andSImageIsNull() {
            addCriterion("s_image is null");
            return (Criteria) this;
        }

        public Criteria andSImageIsNotNull() {
            addCriterion("s_image is not null");
            return (Criteria) this;
        }

        public Criteria andSImageEqualTo(String value) {
            addCriterion("s_image =", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageNotEqualTo(String value) {
            addCriterion("s_image <>", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageGreaterThan(String value) {
            addCriterion("s_image >", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageGreaterThanOrEqualTo(String value) {
            addCriterion("s_image >=", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageLessThan(String value) {
            addCriterion("s_image <", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageLessThanOrEqualTo(String value) {
            addCriterion("s_image <=", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageLike(String value) {
            addCriterion("s_image like", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageNotLike(String value) {
            addCriterion("s_image not like", value, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageIn(List<String> values) {
            addCriterion("s_image in", values, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageNotIn(List<String> values) {
            addCriterion("s_image not in", values, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageBetween(String value1, String value2) {
            addCriterion("s_image between", value1, value2, "sImage");
            return (Criteria) this;
        }

        public Criteria andSImageNotBetween(String value1, String value2) {
            addCriterion("s_image not between", value1, value2, "sImage");
            return (Criteria) this;
        }

        public Criteria andSClassificationIsNull() {
            addCriterion("s_classification is null");
            return (Criteria) this;
        }

        public Criteria andSClassificationIsNotNull() {
            addCriterion("s_classification is not null");
            return (Criteria) this;
        }

        public Criteria andSClassificationEqualTo(String value) {
            addCriterion("s_classification =", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationNotEqualTo(String value) {
            addCriterion("s_classification <>", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationGreaterThan(String value) {
            addCriterion("s_classification >", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("s_classification >=", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationLessThan(String value) {
            addCriterion("s_classification <", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationLessThanOrEqualTo(String value) {
            addCriterion("s_classification <=", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationLike(String value) {
            addCriterion("s_classification like", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationNotLike(String value) {
            addCriterion("s_classification not like", value, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationIn(List<String> values) {
            addCriterion("s_classification in", values, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationNotIn(List<String> values) {
            addCriterion("s_classification not in", values, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationBetween(String value1, String value2) {
            addCriterion("s_classification between", value1, value2, "sClassification");
            return (Criteria) this;
        }

        public Criteria andSClassificationNotBetween(String value1, String value2) {
            addCriterion("s_classification not between", value1, value2, "sClassification");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}