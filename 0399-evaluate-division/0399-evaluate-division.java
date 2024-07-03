class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Map<String,Double>> relation =new HashMap<>();     
        for (int i = 0; i < values.length; i++) {
            List<String> eq = equations.get(i);
            String a = eq.get(0), b = eq.get(1);
            Map<String, Double> r1 = relation.get(a);
            Map<String, Double> r2 = relation.get(b);
            if (r1 == null && r2 == null) {
                Map<String, Double> r = new HashMap<>();
                r.put(a, values[i]);
                r.put(b, 1.0);
                relation.put(a, r);
                relation.put(b, r);
            } else if (r1 == null) {
                r2.put(a, r2.get(b) * values[i]);
                relation.put(a, r2);
            } else if (r2 == null) {
                r1.put(b, r1.get(a) / values[i]);
                relation.put(b, r1);
            } else { 
                double factor = r2.get(b) * values[i] / r1.get(a);
                for (Map.Entry<String, Double> e : r1.entrySet()) {
                    r2.put(e.getKey(), e.getValue() * factor);
                    relation.put(e.getKey(), r2);
                }
            }
        }
        
        double[] ans = new double[queries.size()];
        for (int i = 0; i < ans.length; i++) {
            List<String> q = queries.get(i);
            String a = q.get(0), b = q.get(1);
            Map<String, Double> r1 = relation.get(a);
            Map<String, Double> r2 = relation.get(b);
            if (r1 == null || r2 == null || r1 != r2) {
                ans[i] = -1.0;
            } else {
                ans[i] = r1.get(a) / r2.get(b);
            }
        }
        
        return ans;
    }        
}