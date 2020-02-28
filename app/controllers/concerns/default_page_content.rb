module DefaultPageContent
    extend ActiveSupport::Concern

    included do
        before_action :set_page_title_defaults
    end

    def set_page_title_defaults
        @page_title = "Routing Application"
        @seo_keywords = "Portfolio"
    end
end