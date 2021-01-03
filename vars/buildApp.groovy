import com.sk.BuildApplication

def call(Closure closure){
    BuildApplication buildApplication = new BuildApplication()
    buildApplication.build()
}