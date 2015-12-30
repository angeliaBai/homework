package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class NodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
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

        public Criteria andNodeidIsNull() {
            addCriterion("nodeid is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("nodeid is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(Integer value) {
            addCriterion("nodeid =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(Integer value) {
            addCriterion("nodeid <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(Integer value) {
            addCriterion("nodeid >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nodeid >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(Integer value) {
            addCriterion("nodeid <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(Integer value) {
            addCriterion("nodeid <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<Integer> values) {
            addCriterion("nodeid in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<Integer> values) {
            addCriterion("nodeid not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(Integer value1, Integer value2) {
            addCriterion("nodeid between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("nodeid not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNull() {
            addCriterion("nodeIp is null");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNotNull() {
            addCriterion("nodeIp is not null");
            return (Criteria) this;
        }

        public Criteria andNodeipEqualTo(String value) {
            addCriterion("nodeIp =", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotEqualTo(String value) {
            addCriterion("nodeIp <>", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThan(String value) {
            addCriterion("nodeIp >", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThanOrEqualTo(String value) {
            addCriterion("nodeIp >=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThan(String value) {
            addCriterion("nodeIp <", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThanOrEqualTo(String value) {
            addCriterion("nodeIp <=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLike(String value) {
            addCriterion("nodeIp like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotLike(String value) {
            addCriterion("nodeIp not like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipIn(List<String> values) {
            addCriterion("nodeIp in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotIn(List<String> values) {
            addCriterion("nodeIp not in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipBetween(String value1, String value2) {
            addCriterion("nodeIp between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotBetween(String value1, String value2) {
            addCriterion("nodeIp not between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andCpurateIsNull() {
            addCriterion("cpuRate is null");
            return (Criteria) this;
        }

        public Criteria andCpurateIsNotNull() {
            addCriterion("cpuRate is not null");
            return (Criteria) this;
        }

        public Criteria andCpurateEqualTo(Double value) {
            addCriterion("cpuRate =", value, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateNotEqualTo(Double value) {
            addCriterion("cpuRate <>", value, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateGreaterThan(Double value) {
            addCriterion("cpuRate >", value, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateGreaterThanOrEqualTo(Double value) {
            addCriterion("cpuRate >=", value, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateLessThan(Double value) {
            addCriterion("cpuRate <", value, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateLessThanOrEqualTo(Double value) {
            addCriterion("cpuRate <=", value, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateIn(List<Double> values) {
            addCriterion("cpuRate in", values, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateNotIn(List<Double> values) {
            addCriterion("cpuRate not in", values, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateBetween(Double value1, Double value2) {
            addCriterion("cpuRate between", value1, value2, "cpurate");
            return (Criteria) this;
        }

        public Criteria andCpurateNotBetween(Double value1, Double value2) {
            addCriterion("cpuRate not between", value1, value2, "cpurate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateIsNull() {
            addCriterion("memoryRate is null");
            return (Criteria) this;
        }

        public Criteria andMemoryrateIsNotNull() {
            addCriterion("memoryRate is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryrateEqualTo(Double value) {
            addCriterion("memoryRate =", value, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateNotEqualTo(Double value) {
            addCriterion("memoryRate <>", value, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateGreaterThan(Double value) {
            addCriterion("memoryRate >", value, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateGreaterThanOrEqualTo(Double value) {
            addCriterion("memoryRate >=", value, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateLessThan(Double value) {
            addCriterion("memoryRate <", value, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateLessThanOrEqualTo(Double value) {
            addCriterion("memoryRate <=", value, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateIn(List<Double> values) {
            addCriterion("memoryRate in", values, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateNotIn(List<Double> values) {
            addCriterion("memoryRate not in", values, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateBetween(Double value1, Double value2) {
            addCriterion("memoryRate between", value1, value2, "memoryrate");
            return (Criteria) this;
        }

        public Criteria andMemoryrateNotBetween(Double value1, Double value2) {
            addCriterion("memoryRate not between", value1, value2, "memoryrate");
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