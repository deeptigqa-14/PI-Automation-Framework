package com.verifypolicy.framework.api.models.response.readoneverifypolicy;

import com.verifypolicy.framework.api.models.common.Environment;
import com.verifypolicy.framework.api.models.common.Links;

public class ReadOneVerifyPolicyResponse {
        private Links _links;
        private String id;
        private Environment environment;
        private String name;
        private String description;
        private boolean isDefault;
        private GovernmentId governmentId;
        private FacialComparison facialComparison;
        private Liveness liveness;
        private Email email;
        private Phone phone;
        private Voice voice;
        private Transaction transaction;
        private VerifiableCredential verifiableCredential;
        private IdentityRecordMatching identityRecordMatching;
        private DataBasedIdentityVerification dataBasedIdentityVerification;
        private DeviceOwnership deviceOwnership;
        private Geolocation geolocation;
        private String createdAt;
        private String updatedAt;
        private boolean systemProvided;

        public Links get_links() { return _links; }
        public void set_links(Links _links) { this._links = _links; }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public Environment getEnvironment() { return environment; }
        public void setEnvironment(Environment environment) { this.environment = environment; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public boolean isDefault() { return isDefault; }
        public void setDefault(boolean aDefault) { isDefault = aDefault; }

        public GovernmentId getGovernmentId() { return governmentId; }
        public void setGovernmentId(GovernmentId governmentId) { this.governmentId = governmentId; }

        public FacialComparison getFacialComparison() { return facialComparison; }
        public void setFacialComparison(FacialComparison facialComparison) { this.facialComparison = facialComparison; }

        public Liveness getLiveness() { return liveness; }
        public void setLiveness(Liveness liveness) { this.liveness = liveness; }

        public Email getEmail() { return email; }
        public void setEmail(Email email) { this.email = email; }

        public Phone getPhone() { return phone; }
        public void setPhone(Phone phone) { this.phone = phone; }

        public Voice getVoice() { return voice; }
        public void setVoice(Voice voice) { this.voice = voice; }

        public Transaction getTransaction() { return transaction; }
        public void setTransaction(Transaction transaction) { this.transaction = transaction; }

        public VerifiableCredential getVerifiableCredential() { return verifiableCredential; }
        public void setVerifiableCredential(VerifiableCredential verifiableCredential) { this.verifiableCredential = verifiableCredential; }

        public IdentityRecordMatching getIdentityRecordMatching() { return identityRecordMatching; }
        public void setIdentityRecordMatching(IdentityRecordMatching identityRecordMatching) { this.identityRecordMatching = identityRecordMatching; }

        public DataBasedIdentityVerification getDataBasedIdentityVerification() { return dataBasedIdentityVerification; }
        public void setDataBasedIdentityVerification(DataBasedIdentityVerification dataBasedIdentityVerification) { this.dataBasedIdentityVerification = dataBasedIdentityVerification; }

        public DeviceOwnership getDeviceOwnership() { return deviceOwnership; }
        public void setDeviceOwnership(DeviceOwnership deviceOwnership) { this.deviceOwnership = deviceOwnership; }

        public Geolocation getGeolocation() { return geolocation; }
        public void setGeolocation(Geolocation geolocation) { this.geolocation = geolocation; }

        public String getCreatedAt() { return createdAt; }
        public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

        public String getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }

        public boolean isSystemProvided() { return systemProvided; }
        public void setSystemProvided(boolean systemProvided) { this.systemProvided = systemProvided; }


}
