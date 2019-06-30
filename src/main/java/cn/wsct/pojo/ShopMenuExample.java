package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopMenuExample() {
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

        public Criteria andSmIdIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmIdEqualTo(Integer value) {
            addCriterion("sm_id =", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThan(Integer value) {
            addCriterion("sm_id <", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdIn(List<Integer> values) {
            addCriterion("sm_id in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "smId");
            return (Criteria) this;
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

        public Criteria andSmDishnameIsNull() {
            addCriterion("sm_dishName is null");
            return (Criteria) this;
        }

        public Criteria andSmDishnameIsNotNull() {
            addCriterion("sm_dishName is not null");
            return (Criteria) this;
        }

        public Criteria andSmDishnameEqualTo(String value) {
            addCriterion("sm_dishName =", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameNotEqualTo(String value) {
            addCriterion("sm_dishName <>", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameGreaterThan(String value) {
            addCriterion("sm_dishName >", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_dishName >=", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameLessThan(String value) {
            addCriterion("sm_dishName <", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameLessThanOrEqualTo(String value) {
            addCriterion("sm_dishName <=", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameLike(String value) {
            addCriterion("sm_dishName like", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameNotLike(String value) {
            addCriterion("sm_dishName not like", value, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameIn(List<String> values) {
            addCriterion("sm_dishName in", values, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameNotIn(List<String> values) {
            addCriterion("sm_dishName not in", values, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameBetween(String value1, String value2) {
            addCriterion("sm_dishName between", value1, value2, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmDishnameNotBetween(String value1, String value2) {
            addCriterion("sm_dishName not between", value1, value2, "smDishname");
            return (Criteria) this;
        }

        public Criteria andSmPriceIsNull() {
            addCriterion("sm_price is null");
            return (Criteria) this;
        }

        public Criteria andSmPriceIsNotNull() {
            addCriterion("sm_price is not null");
            return (Criteria) this;
        }

        public Criteria andSmPriceEqualTo(Double value) {
            addCriterion("sm_price =", value, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceNotEqualTo(Double value) {
            addCriterion("sm_price <>", value, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceGreaterThan(Double value) {
            addCriterion("sm_price >", value, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sm_price >=", value, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceLessThan(Double value) {
            addCriterion("sm_price <", value, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceLessThanOrEqualTo(Double value) {
            addCriterion("sm_price <=", value, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceIn(List<Double> values) {
            addCriterion("sm_price in", values, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceNotIn(List<Double> values) {
            addCriterion("sm_price not in", values, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceBetween(Double value1, Double value2) {
            addCriterion("sm_price between", value1, value2, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmPriceNotBetween(Double value1, Double value2) {
            addCriterion("sm_price not between", value1, value2, "smPrice");
            return (Criteria) this;
        }

        public Criteria andSmStockIsNull() {
            addCriterion("sm_stock is null");
            return (Criteria) this;
        }

        public Criteria andSmStockIsNotNull() {
            addCriterion("sm_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSmStockEqualTo(Integer value) {
            addCriterion("sm_stock =", value, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockNotEqualTo(Integer value) {
            addCriterion("sm_stock <>", value, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockGreaterThan(Integer value) {
            addCriterion("sm_stock >", value, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_stock >=", value, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockLessThan(Integer value) {
            addCriterion("sm_stock <", value, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockLessThanOrEqualTo(Integer value) {
            addCriterion("sm_stock <=", value, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockIn(List<Integer> values) {
            addCriterion("sm_stock in", values, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockNotIn(List<Integer> values) {
            addCriterion("sm_stock not in", values, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockBetween(Integer value1, Integer value2) {
            addCriterion("sm_stock between", value1, value2, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmStockNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_stock not between", value1, value2, "smStock");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeIsNull() {
            addCriterion("sm_salesVolume is null");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeIsNotNull() {
            addCriterion("sm_salesVolume is not null");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeEqualTo(Integer value) {
            addCriterion("sm_salesVolume =", value, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeNotEqualTo(Integer value) {
            addCriterion("sm_salesVolume <>", value, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeGreaterThan(Integer value) {
            addCriterion("sm_salesVolume >", value, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_salesVolume >=", value, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeLessThan(Integer value) {
            addCriterion("sm_salesVolume <", value, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("sm_salesVolume <=", value, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeIn(List<Integer> values) {
            addCriterion("sm_salesVolume in", values, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeNotIn(List<Integer> values) {
            addCriterion("sm_salesVolume not in", values, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeBetween(Integer value1, Integer value2) {
            addCriterion("sm_salesVolume between", value1, value2, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmSalesvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_salesVolume not between", value1, value2, "smSalesvolume");
            return (Criteria) this;
        }

        public Criteria andSmDetailsIsNull() {
            addCriterion("sm_details is null");
            return (Criteria) this;
        }

        public Criteria andSmDetailsIsNotNull() {
            addCriterion("sm_details is not null");
            return (Criteria) this;
        }

        public Criteria andSmDetailsEqualTo(String value) {
            addCriterion("sm_details =", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsNotEqualTo(String value) {
            addCriterion("sm_details <>", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsGreaterThan(String value) {
            addCriterion("sm_details >", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("sm_details >=", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsLessThan(String value) {
            addCriterion("sm_details <", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsLessThanOrEqualTo(String value) {
            addCriterion("sm_details <=", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsLike(String value) {
            addCriterion("sm_details like", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsNotLike(String value) {
            addCriterion("sm_details not like", value, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsIn(List<String> values) {
            addCriterion("sm_details in", values, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsNotIn(List<String> values) {
            addCriterion("sm_details not in", values, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsBetween(String value1, String value2) {
            addCriterion("sm_details between", value1, value2, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmDetailsNotBetween(String value1, String value2) {
            addCriterion("sm_details not between", value1, value2, "smDetails");
            return (Criteria) this;
        }

        public Criteria andSmImageIsNull() {
            addCriterion("sm_image is null");
            return (Criteria) this;
        }

        public Criteria andSmImageIsNotNull() {
            addCriterion("sm_image is not null");
            return (Criteria) this;
        }

        public Criteria andSmImageEqualTo(String value) {
            addCriterion("sm_image =", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageNotEqualTo(String value) {
            addCriterion("sm_image <>", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageGreaterThan(String value) {
            addCriterion("sm_image >", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageGreaterThanOrEqualTo(String value) {
            addCriterion("sm_image >=", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageLessThan(String value) {
            addCriterion("sm_image <", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageLessThanOrEqualTo(String value) {
            addCriterion("sm_image <=", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageLike(String value) {
            addCriterion("sm_image like", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageNotLike(String value) {
            addCriterion("sm_image not like", value, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageIn(List<String> values) {
            addCriterion("sm_image in", values, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageNotIn(List<String> values) {
            addCriterion("sm_image not in", values, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageBetween(String value1, String value2) {
            addCriterion("sm_image between", value1, value2, "smImage");
            return (Criteria) this;
        }

        public Criteria andSmImageNotBetween(String value1, String value2) {
            addCriterion("sm_image not between", value1, value2, "smImage");
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