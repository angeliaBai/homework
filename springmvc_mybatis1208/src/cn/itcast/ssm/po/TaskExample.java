package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTasknameIsNull() {
            addCriterion("taskName is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskName is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskName =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskName <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskName >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskName >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskName <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskName <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskName like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskName not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskName in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskName not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskName between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskName not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNull() {
            addCriterion("runTime is null");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNotNull() {
            addCriterion("runTime is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimeEqualTo(Date value) {
            addCriterion("runTime =", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotEqualTo(Date value) {
            addCriterion("runTime <>", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThan(Date value) {
            addCriterion("runTime >", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("runTime >=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThan(Date value) {
            addCriterion("runTime <", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThanOrEqualTo(Date value) {
            addCriterion("runTime <=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIn(List<Date> values) {
            addCriterion("runTime in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotIn(List<Date> values) {
            addCriterion("runTime not in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeBetween(Date value1, Date value2) {
            addCriterion("runTime between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotBetween(Date value1, Date value2) {
            addCriterion("runTime not between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNull() {
            addCriterion("interval is null");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNotNull() {
            addCriterion("interval is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalEqualTo(Double value) {
            addCriterion("interval =", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotEqualTo(Double value) {
            addCriterion("interval <>", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThan(Double value) {
            addCriterion("interval >", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThanOrEqualTo(Double value) {
            addCriterion("interval >=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThan(Double value) {
            addCriterion("interval <", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThanOrEqualTo(Double value) {
            addCriterion("interval <=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalIn(List<Double> values) {
            addCriterion("interval in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotIn(List<Double> values) {
            addCriterion("interval not in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalBetween(Double value1, Double value2) {
            addCriterion("interval between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotBetween(Double value1, Double value2) {
            addCriterion("interval not between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andJarurlIsNull() {
            addCriterion("jarUrl is null");
            return (Criteria) this;
        }

        public Criteria andJarurlIsNotNull() {
            addCriterion("jarUrl is not null");
            return (Criteria) this;
        }

        public Criteria andJarurlEqualTo(String value) {
            addCriterion("jarUrl =", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlNotEqualTo(String value) {
            addCriterion("jarUrl <>", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlGreaterThan(String value) {
            addCriterion("jarUrl >", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlGreaterThanOrEqualTo(String value) {
            addCriterion("jarUrl >=", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlLessThan(String value) {
            addCriterion("jarUrl <", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlLessThanOrEqualTo(String value) {
            addCriterion("jarUrl <=", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlLike(String value) {
            addCriterion("jarUrl like", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlNotLike(String value) {
            addCriterion("jarUrl not like", value, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlIn(List<String> values) {
            addCriterion("jarUrl in", values, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlNotIn(List<String> values) {
            addCriterion("jarUrl not in", values, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlBetween(String value1, String value2) {
            addCriterion("jarUrl between", value1, value2, "jarurl");
            return (Criteria) this;
        }

        public Criteria andJarurlNotBetween(String value1, String value2) {
            addCriterion("jarUrl not between", value1, value2, "jarurl");
            return (Criteria) this;
        }

        public Criteria andFinishrateIsNull() {
            addCriterion("finishRate is null");
            return (Criteria) this;
        }

        public Criteria andFinishrateIsNotNull() {
            addCriterion("finishRate is not null");
            return (Criteria) this;
        }

        public Criteria andFinishrateEqualTo(Double value) {
            addCriterion("finishRate =", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotEqualTo(Double value) {
            addCriterion("finishRate <>", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateGreaterThan(Double value) {
            addCriterion("finishRate >", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateGreaterThanOrEqualTo(Double value) {
            addCriterion("finishRate >=", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateLessThan(Double value) {
            addCriterion("finishRate <", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateLessThanOrEqualTo(Double value) {
            addCriterion("finishRate <=", value, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateIn(List<Double> values) {
            addCriterion("finishRate in", values, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotIn(List<Double> values) {
            addCriterion("finishRate not in", values, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateBetween(Double value1, Double value2) {
            addCriterion("finishRate between", value1, value2, "finishrate");
            return (Criteria) this;
        }

        public Criteria andFinishrateNotBetween(Double value1, Double value2) {
            addCriterion("finishRate not between", value1, value2, "finishrate");
            return (Criteria) this;
        }

        public Criteria andLogurlIsNull() {
            addCriterion("logUrl is null");
            return (Criteria) this;
        }

        public Criteria andLogurlIsNotNull() {
            addCriterion("logUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLogurlEqualTo(String value) {
            addCriterion("logUrl =", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlNotEqualTo(String value) {
            addCriterion("logUrl <>", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlGreaterThan(String value) {
            addCriterion("logUrl >", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlGreaterThanOrEqualTo(String value) {
            addCriterion("logUrl >=", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlLessThan(String value) {
            addCriterion("logUrl <", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlLessThanOrEqualTo(String value) {
            addCriterion("logUrl <=", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlLike(String value) {
            addCriterion("logUrl like", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlNotLike(String value) {
            addCriterion("logUrl not like", value, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlIn(List<String> values) {
            addCriterion("logUrl in", values, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlNotIn(List<String> values) {
            addCriterion("logUrl not in", values, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlBetween(String value1, String value2) {
            addCriterion("logUrl between", value1, value2, "logurl");
            return (Criteria) this;
        }

        public Criteria andLogurlNotBetween(String value1, String value2) {
            addCriterion("logUrl not between", value1, value2, "logurl");
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