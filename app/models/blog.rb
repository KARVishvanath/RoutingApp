class Blog < ApplicationRecord
  belongs_to :topic
  validates :title, presence: true
end
