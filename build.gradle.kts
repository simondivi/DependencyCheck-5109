import org.owasp.dependencycheck.reporting.ReportGenerator

plugins {
    java
    id("org.owasp.dependencycheck") version "8.4.0"
}

dependencies {
    runtimeOnly("org.apache.qpid:qpid-broker-plugins-management-http:8.0.6")

}

repositories {
    mavenCentral()
}


dependencyCheck {
    scanConfigurations = listOf(configurations.runtimeClasspath.get().name)
    formats = listOf(ReportGenerator.Format.XML.name, ReportGenerator.Format.HTML.name)

    analyzers.autoconfEnabled = false
    analyzers.bundleAuditEnabled = false
    analyzers.centralEnabled = false
    analyzers.cmakeEnabled = false
    analyzers.cocoapodsEnabled = false
    analyzers.composerEnabled = false
    analyzers.cpanEnabled = false
    analyzers.dartEnabled = false
    analyzers.dartEnabled = false
    analyzers.golangDepEnabled = false
    analyzers.golangModEnabled = false
    analyzers.msbuildEnabled = false
    analyzers.nexusEnabled = false
    analyzers.nodeAudit.enabled = false
    analyzers.nodeEnabled = false
    analyzers.nugetconfEnabled = false
    analyzers.pyDistributionEnabled = false
    analyzers.pyPackageEnabled = false
    analyzers.rubygemsEnabled = false
    analyzers.swiftEnabled = false
    analyzers.swiftPackageResolvedEnabled = false

    analyzers.retirejs.enabled = true // TODO enable as soon as the results can be aggregated to show one per artifact

}
