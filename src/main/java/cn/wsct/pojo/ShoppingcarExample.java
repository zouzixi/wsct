package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcarExample() {
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIsNull() {
            addCriterion("u_telephone is null");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIsNotNull() {
            addCriterion("u_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUTelephoneEqualTo(String value) {
            addCriterion("u_telephone =", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotEqualTo(String value) {
            addCriterion("u_telephone <>", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneGreaterThan(String value) {
            addCriterion("u_telephone >", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_telephone >=", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLessThan(String value) {
            addCriterion("u_telephone <", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLessThanOrEqualTo(String value) {
            addCriterion("u_telephone <=", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLike(String value) {
            addCriterion("u_telephone like", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotLike(String value) {
            addCriterion("u_telephone not like", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIn(List<String> values) {
            addCriterion("u_telephone in", values, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotIn(List<String> values) {
            addCriterion("u_telephone not in", values, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneBetween(String value1, String value2) {
            addCriterion("u_telephone between", value1, value2, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotBetween(String value1, String value2) {
            addCriterion("u_telephone not between", value1, value2, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andScDishnameIsNull() {
            addCriterion("sc_dishName is null");
            return (Criteria) this;
        }

        public Criteria andScDishnameIsNotNull() {
            addCriterion("sc_dishName is not null");
            return (Criteria) this;
        }

        public Criteria andScDishnameEqualTo(String value) {
            addCriterion("sc_dishName =", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameNotEqualTo(String value) {
            addCriterion("sc_dishName <>", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameGreaterThan(String value) {
            addCriterion("sc_dishName >", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_dishName >=", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameLessThan(String value) {
            addCriterion("sc_dishName <", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameLessThanOrEqualTo(String value) {
            addCriterion("sc_dishName <=", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameLike(String value) {
            addCriterion("sc_dishName like", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameNotLike(String value) {
            addCriterion("sc_dishName not like", value, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameIn(List<String> values) {
            addCriterion("sc_dishName in", values, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameNotIn(List<String> values) {
            addCriterion("sc_dishName not in", values, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameBetween(String value1, String value2) {
            addCriterion("sc_dishName between", value1, value2, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScDishnameNotBetween(String value1, String value2) {
            addCriterion("sc_dishName not between", value1, value2, "scDishname");
            return (Criteria) this;
        }

        public Criteria andScImgIsNull() {
            addCriterion("sc_img is null");
            return (Criteria) this;
        }

        public Criteria andScImgIsNotNull() {
            addCriterion("sc_img is not null");
            return (Criteria) this;
        }

        public Criteria andScImgEqualTo(String value) {
            addCriterion("sc_img =", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgNotEqualTo(String value) {
            addCriterion("sc_img <>", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgGreaterThan(String value) {
            addCriterion("sc_img >", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgGreaterThanOrEqualTo(String value) {
            addCriterion("sc_img >=", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgLessThan(String value) {
            addCriterion("sc_img <", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgLessThanOrEqualTo(String value) {
            addCriterion("sc_img <=", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgLike(String value) {
            addCriterion("sc_img like", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgNotLike(String value) {
            addCriterion("sc_img not like", value, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgIn(List<String> values) {
            addCriterion("sc_img in", values, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgNotIn(List<String> values) {
            addCriterion("sc_img not in", values, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgBetween(String value1, String value2) {
            addCriterion("sc_img between", value1, value2, "scImg");
            return (Criteria) this;
        }

        public Criteria andScImgNotBetween(String value1, String value2) {
            addCriterion("sc_img not between", value1, value2, "scImg");
            return (Criteria) this;
        }

        public Criteria andScPriceIsNull() {
            addCriterion("sc_price is null");
            return (Criteria) this;
        }

        public Criteria andScPriceIsNotNull() {
            addCriterion("sc_price is not null");
            return (Criteria) this;
        }

        public Criteria andScPriceEqualTo(Double value) {
            addCriterion("sc_price =", value, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceNotEqualTo(Double value) {
            addCriterion("sc_price <>", value, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceGreaterThan(Double value) {
            addCriterion("sc_price >", value, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sc_price >=", value, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceLessThan(Double value) {
            addCriterion("sc_price <", value, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceLessThanOrEqualTo(Double value) {
            addCriterion("sc_price <=", value, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceIn(List<Double> values) {
            addCriterion("sc_price in", values, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceNotIn(List<Double> values) {
            addCriterion("sc_price not in", values, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceBetween(Double value1, Double value2) {
            addCriterion("sc_price between", value1, value2, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScPriceNotBetween(Double value1, Double value2) {
            addCriterion("sc_price not between", value1, value2, "scPrice");
            return (Criteria) this;
        }

        public Criteria andScNumberIsNull() {
            addCriterion("sc_number is null");
            return (Criteria) this;
        }

        public Criteria andScNumberIsNotNull() {
            addCriterion("sc_number is not null");
            return (Criteria) this;
        }

        public Criteria andScNumberEqualTo(Integer value) {
            addCriterion("sc_number =", value, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberNotEqualTo(Integer value) {
            addCriterion("sc_number <>", value, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberGreaterThan(Integer value) {
            addCriterion("sc_number >", value, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_number >=", value, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberLessThan(Integer value) {
            addCriterion("sc_number <", value, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sc_number <=", value, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberIn(List<Integer> values) {
            addCriterion("sc_number in", values, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberNotIn(List<Integer> values) {
            addCriterion("sc_number not in", values, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberBetween(Integer value1, Integer value2) {
            addCriterion("sc_number between", value1, value2, "scNumber");
            return (Criteria) this;
        }

        public Criteria andScNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_number not between", value1, value2, "scNumber");
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