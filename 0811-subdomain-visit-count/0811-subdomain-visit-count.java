class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
     Map<String, Integer> domainCount = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];

            String[] subdomains = domain.split("\\.");
            for (int i = 0; i < subdomains.length; i++) {
                String subdomain = String.join(".", Arrays.copyOfRange(subdomains, i, subdomains.length));
                domainCount.put(subdomain, domainCount.getOrDefault(subdomain, 0) + count);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : domainCount.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }    
}